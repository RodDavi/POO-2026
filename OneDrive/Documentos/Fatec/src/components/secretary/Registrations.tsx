import React, { useState } from 'react';
import { motion } from 'motion/react';
import { ArrowLeft, User, Dog, Stethoscope, List, CheckCircle, AlertCircle } from 'lucide-react';
import { Button } from '../ui/button';
import { Card } from '../ui/card';
import { Dialog, DialogContent, DialogHeader, DialogTitle } from '../ui/dialog';
import { Input } from '../ui/input';
import { Label } from '../ui/label';
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '../ui/select';
import { toast } from 'sonner@2.0.3';

interface RegistrationsProps {
  onBack: () => void;
}

const registrationTypes = [
  {
    id: 'client',
    title: 'Cadastrar Cliente',
    description: 'Adicione um novo cliente ao sistema',
    icon: User,
    color: 'from-blue-500 to-blue-600',
  },
  {
    id: 'animal',
    title: 'Cadastrar Animal',
    description: 'Registre um novo animal',
    icon: Dog,
    color: 'from-green-500 to-green-600',
  },
  {
    id: 'species',
    title: 'Cadastrar Espécie',
    description: 'Adicione uma nova espécie',
    icon: List,
    color: 'from-purple-500 to-purple-600',
  },
  {
    id: 'vet',
    title: 'Cadastrar Médico',
    description: 'Registre um novo veterinário',
    icon: Stethoscope,
    color: 'from-[#FCA311] to-orange-600',
  },
];

export default function Registrations({ onBack }: RegistrationsProps) {
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [currentType, setCurrentType] = useState<string | null>(null);
  const [formData, setFormData] = useState<Record<string, string>>({});
  const [showSuccess, setShowSuccess] = useState(false);

  const openModal = (type: string) => {
    setCurrentType(type);
    setFormData({});
    setIsModalOpen(true);
    setShowSuccess(false);
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    
    // Show success animation
    setShowSuccess(true);
    toast.success('✅ Sucesso');
    
    setTimeout(() => {
      setIsModalOpen(false);
      setShowSuccess(false);
    }, 1500);
  };

  const getFormFields = () => {
    switch (currentType) {
      case 'client':
        return [
          { id: 'name', label: 'Nome completo', type: 'text', required: true },
          { id: 'email', label: 'E-mail', type: 'email', required: true },
          { id: 'phone', label: 'Telefone', type: 'tel', required: true },
          { id: 'address', label: 'Endereço', type: 'text', required: false },
        ];
      case 'animal':
        return [
          { id: 'name', label: 'Nome do animal', type: 'text', required: true },
          { id: 'species', label: 'Espécie', type: 'select', required: true, options: ['Cão', 'Gato', 'Pássaro', 'Coelho'] },
          { id: 'breed', label: 'Raça', type: 'text', required: false },
          { id: 'age', label: 'Idade', type: 'number', required: false },
          { id: 'owner', label: 'Proprietário', type: 'select', required: true, options: ['João Silva', 'Maria Santos', 'Pedro Oliveira'] },
        ];
      case 'species':
        return [
          { id: 'name', label: 'Nome da espécie', type: 'text', required: true },
          { id: 'description', label: 'Descrição', type: 'text', required: false },
        ];
      case 'vet':
        return [
          { id: 'name', label: 'Nome completo', type: 'text', required: true },
          { id: 'crmv', label: 'CRMV', type: 'text', required: true },
          { id: 'email', label: 'E-mail', type: 'email', required: true },
          { id: 'phone', label: 'Telefone', type: 'tel', required: true },
          { id: 'specialty', label: 'Especialidade', type: 'text', required: false },
        ];
      default:
        return [];
    }
  };

  const getModalTitle = () => {
    const type = registrationTypes.find(t => t.id === currentType);
    return type?.title || 'Cadastro';
  };

  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <Button
          variant="ghost"
          onClick={onBack}
          className="mb-6"
        >
          <ArrowLeft size={18} strokeWidth={1.5} className="mr-2" />
          Voltar
        </Button>

        <h1 className="text-3xl text-[#14213D] mb-2">Cadastros</h1>
        <p className="text-gray-600 mb-8">Escolha o tipo de cadastro que deseja realizar</p>

        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
          {registrationTypes.map((type, index) => {
            const Icon = type.icon;
            return (
              <motion.div
                key={type.id}
                initial={{ opacity: 0, y: 20 }}
                animate={{ opacity: 1, y: 0 }}
                transition={{ duration: 0.5, delay: index * 0.1 }}
              >
                <Card
                  className="p-6 cursor-pointer transition-all hover:shadow-xl hover:-translate-y-1 border-0"
                  onClick={() => openModal(type.id)}
                >
                  <div className={`w-12 h-12 rounded-xl bg-gradient-to-br ${type.color} flex items-center justify-center mb-4`}>
                    <Icon size={24} strokeWidth={1.5} className="text-white" />
                  </div>
                  <h3 className="text-[#14213D] mb-2">{type.title}</h3>
                  <p className="text-sm text-gray-600">{type.description}</p>
                </Card>
              </motion.div>
            );
          })}
        </div>
      </motion.div>

      {/* Registration Modal */}
      <Dialog open={isModalOpen} onOpenChange={setIsModalOpen}>
        <DialogContent className="max-w-md">
          <DialogHeader>
            <DialogTitle>{getModalTitle()}</DialogTitle>
          </DialogHeader>

          {showSuccess ? (
            <motion.div
              initial={{ scale: 0 }}
              animate={{ scale: 1 }}
              className="flex flex-col items-center justify-center py-12"
            >
              <div className="w-20 h-20 rounded-full bg-green-100 flex items-center justify-center mb-4">
                <CheckCircle size={48} strokeWidth={1.5} className="text-green-600" />
              </div>
              <p className="text-lg text-[#14213D]">Cadastro realizado!</p>
            </motion.div>
          ) : (
            <form onSubmit={handleSubmit} className="space-y-4">
              {getFormFields().map((field) => (
                <div key={field.id}>
                  <Label htmlFor={field.id}>
                    {field.label} {field.required && '*'}
                  </Label>
                  {field.type === 'select' ? (
                    <Select
                      value={formData[field.id] || ''}
                      onValueChange={(value) => setFormData({ ...formData, [field.id]: value })}
                      required={field.required}
                    >
                      <SelectTrigger>
                        <SelectValue placeholder={`Selecione ${field.label.toLowerCase()}`} />
                      </SelectTrigger>
                      <SelectContent>
                        {field.options?.map((option) => (
                          <SelectItem key={option} value={option}>{option}</SelectItem>
                        ))}
                      </SelectContent>
                    </Select>
                  ) : (
                    <Input
                      id={field.id}
                      type={field.type}
                      value={formData[field.id] || ''}
                      onChange={(e) => setFormData({ ...formData, [field.id]: e.target.value })}
                      required={field.required}
                      placeholder={`Digite ${field.label.toLowerCase()}`}
                    />
                  )}
                </div>
              ))}

              <div className="flex justify-end gap-3 pt-4">
                <Button type="button" variant="outline" onClick={() => setIsModalOpen(false)}>
                  Cancelar
                </Button>
                <Button type="submit" className="bg-green-600 hover:bg-green-700 text-white">
                  <CheckCircle size={18} strokeWidth={1.5} className="mr-2" />
                  Salvar
                </Button>
              </div>
            </form>
          )}
        </DialogContent>
      </Dialog>
    </div>
  );
}
